package ru.reflection.skype.factory;

import ru.reflection.skype.factory.scheme.IScheme;
import ru.reflection.skype.factory.scheme.exception.NotCorrectSchemeException;

/**
 * Parses the scheme, creates instance-scheme and fills all fields.
 */


public interface IFactoryScheme {
    IScheme parseScheme(String scheme) throws NotCorrectSchemeException;
}
