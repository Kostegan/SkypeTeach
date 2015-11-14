package ru.internal.skype;

/**
 *
 */
public class Main {
    // create Static internal class
    ExternalClass.StaticInternalClass staticClass = new ExternalClass.StaticInternalClass();

    // create no static internal class
    ExternalClass extClass = new ExternalClass();
    ExternalClass.NoStaticInternalClass noStaticInternalClass = extClass.new NoStaticInternalClass("Terr",23,22);


}
