package ru.teach.skype.bits;

/**
 *
 */
public class BitsTeach {
    public static void main(String[] args) {
        // 8 flags
        // 1M clients
        // client sends its state (8 flags) 100 times/second

        // clients sends: 8*1(byte)*100 = 800 bytes/second (100 bytes/sec)

        // server receives: 1M*800(bytes) = 8MB (1MB)

        // byte 7 = 0000 0111 = 1*2^2 + 1*2^1 + 1*2^0 = 4 + 2 + 1 = 7
        // false = byte 0 = 0000 0000
        // true = byte 1 = 0000 0001

        // 185(10)  = 1*10^2 + 8*10^1 + 5*10^0
        // 110(2) = 1*2^2 + 1*2^1 + 0*2^0

        // >>, <<, >>>, &, |

        byte flags = 0; // 0000 0000
        // [left_window, right_window, left_door, right_door, trunk, light, motor, guard]
        // [false,       true,         true,      false,      false, true,  false, false]

        final byte left_window_mask = (byte) 0x80 ; // 1000 0000 = 0x80 (0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F)
        final byte right_window_mask = (byte) 0x40; // 0100 0000
        final byte left_door_mask = (byte) 0x20; // 0010 0000
        final byte right_door_mask = (byte) 0x10; // 0001 0000
        final byte trunk_mask = (byte) 0x08; // 0000 1000
        final byte light_mask = (byte) 0x04; // 0000 0100
        final byte motor_mask = (byte) 0x02; // 0000 0010
        final byte guard_mask = (byte) 0x01; // 0000 0001

        // client sends

        // flags = [false,       false,         false,      false,      false, false,  false, false]
        // turn on: right_window: [false,       true,         false,      false,      false, false,  false, false]
        flags |= right_window_mask; // (0000 0000) | (0100 0000) = 0100 0000

        // turn on: trunk
        flags |= trunk_mask; // (0100 0000) | (0000 1000) = 0100 1000

        // turn on: motor
        flags |= motor_mask; // (0100 1000) | (0000 0010) = (0100 1010)

        System.out.println(flags + ": " + toBinaryString(flags));


        // server receives: byte flags (0100 1010)
        // check motor is turned on

        boolean motor = (flags & motor_mask) == motor_mask; // (0100 1010) & (0000 0010) = (0000 0010)
        boolean left_window = (flags & left_window_mask) == left_window_mask;
        boolean right_window = (flags & right_window_mask) == right_window_mask;
        System.out.println("Left window: " + left_window);
        System.out.println("Right window: " + right_window);
        System.out.println("Motor: " + motor);

        byte b = 0x48; // 4*16^1 + 8*16^0 = 64 + 8 = 72: (0100 1000 = 1*2^6 + 1*2^3 = 64 + 8 = 72)
        // 4: 0100, 8: 1000 -> 48(16) = 0100 1000

        // &: (0110 1100) & (1010 0110) = 0010 0100
        // |: (0110 1100) | (1010 0110) = 1110 1110


        byte shift_b = 0x2A; // 0010 1010
        System.out.println("shift_b: " +shift_b + " - " + toBinaryString(shift_b));
        shift_b = (byte) (shift_b << 1); // 0101 0100
        System.out.println("shift_b << 1: " + shift_b + " - " + toBinaryString(shift_b));
        shift_b = (byte) (shift_b >> 7); // 0010 1010
        System.out.println("shift_b >> 7: " + shift_b + " - " + toBinaryString(shift_b));

        byte x = -100;
        System.out.println("x: " + x + " = " + toBinaryString(x));
        x = (byte) (x >> 1); // x >>= 1
        System.out.println("x: " + x + " = " + toBinaryString(x));

//        byte x = 127;
//        System.out.println("x: " + x + " = " + toBinaryString(x));

        // 120. 120*10=1200 (shift left), 120/10=12
        // xyz << 1: xyz0: 120<<1=1200. xyz >> 1 = 0xy = xy
    }

    private static String toBinaryString(byte b) {
        String s = "";
        for (int i=0; i<8; i++) {
            if (i==4) s = " " + s;
            s = ((b>>i)&0x01) + s;
        }
        return s;
    }
}
