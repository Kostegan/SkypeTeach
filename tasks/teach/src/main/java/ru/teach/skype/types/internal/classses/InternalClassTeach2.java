package ru.teach.skype.types.internal.classses;

/**
 *
 */
public class InternalClassTeach2 {
    public static void main(String[] args) {
        InternalClassTeach.StaticInternalClass obj = new InternalClassTeach.StaticInternalClass(2);
        System.out.println(obj.getId());

        InternalClassTeach extObj = new InternalClassTeach("nik");

        extObj.getListener().actionPerformed(null);

        InternalClassTeach.NonStaticInternalClass obj2 = extObj.new NonStaticInternalClass(2);
        InternalClassTeach.NonStaticInternalClass obj3 = extObj.new NonStaticInternalClass(3);

        System.out.println(obj2.getId());

    }
}
