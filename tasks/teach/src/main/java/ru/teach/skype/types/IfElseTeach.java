package ru.teach.skype.types;

/**
 *
 */
public class IfElseTeach {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        if (x > 10) {
            // do something 1
        } else {
            // do something 2
        }

        if (x > 10) {
            // do 1
        } else if (x < 5) {
            // do 2
        } else if (x == y) {
            // do 3
        } else {
            // do 4
        }

        int z;
        if (x < y) {
            z = x;
        } else {
            z = y;
        }
        // ==
        z = x < y ? x : y;

        int schoolPoint = 2; // 1-5
        if (schoolPoint == 5) {
            System.out.println("Excellent!");
        } else if (schoolPoint == 4) {
            System.out.println("Good");
        } else if (schoolPoint == 3) {
            System.out.println("So-so");
        } else if (schoolPoint == 2) {
            System.out.println("Bad");
        } else if (schoolPoint == 1) {
            System.out.println("Very Bad");
        } else {
            System.out.println("Strange!");
        }

        System.out.println("Switch tests:");
        switch (schoolPoint) {
            case 5:
                System.out.println("Excellent!");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("So-so");
                break;
            case 2:
                System.out.println("Bad");
                break;
            case 1:
                System.out.println("Very Bad");
                break;
            default:
                System.out.println("Strange!");
                break;
        }
    }

    public String getPointMessage(int schoolPoint) {
        String message;
        if (schoolPoint == 5) {
            message = "Excellent!";
        } else if (schoolPoint == 4) {
            message = "Good";
        } else if (schoolPoint == 3) {
            message = "So-so";
        } else if (schoolPoint == 2) {
            message = "Bad";
        } else if (schoolPoint == 1) {
            message = "Very Bad";
        } else {
            message = "Strange!";
        }
        return message;
    }

    public String getPointMessage2(int schoolPoint) {
        if (schoolPoint == 5) {
            return "Excellent!";
        }
        if (schoolPoint == 4) {
            return "Good";
        }
        if (schoolPoint == 3) {
            return "So-so";
        }
        if (schoolPoint == 2) {
            return "Bad";
        }
        if (schoolPoint == 1) {
            return "Very Bad";
        }
        return "Strange!";
    }

    public String getPointMessage3(int schoolPoint) {
        switch (schoolPoint) {
            case 5:
                return "Excellent!";
            case 4:
                return "Good";
            case 3:
                return "So-so";
            case 2:
                return "Bad";
            case 1:
                return "Very Bad";
            default:
                return "Strange!";
        }
    }

    public int getPoint(String message) {
        switch (message) {
            case "Excellent!":
                return 5;
            case "Good":
                return 4;
            case "So-so":
                return 3;
            case "Bad":
                return 2;
            case "Very Bad":
                return 1;
            default:
                RuntimeException exception = new RuntimeException("Unexpected message: " + message);
                throw exception;
        }
    }
}
