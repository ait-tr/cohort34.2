/**
 * @author Andrej Reutow
 * created on 09.10.2023
 * <p>
 * Класс для проверки пароля на соответствие заданным требованиям.
 */
public class PasswordValidator {

    private final int minLowerCase;
    private final int minUpperCase;
    private final int minDigits;
    private final int minLength;
    private final String symbolList;
    private final int minSymbolCount;

    /**
     * Конструктор класса PasswordValidator для инициализации параметров проверки пароля.
     *
     * @param minLowerCase   Минимальное количество букв нижнего регистра.
     * @param minUpperCase   Минимальное количество букв верхнего регистра.
     * @param minDigits      Минимальное количество цифр.
     * @param minLength      Минимальная длина пароля.
     * @param symbolList     Список символов, которые должны быть в пароле.
     * @param minSymbolCount Минимальное количество символов из списка.
     */
    public PasswordValidator(int minLowerCase,
                             int minUpperCase,
                             int minDigits,
                             int minLength,
                             String symbolList,
                             int minSymbolCount) {
        this.minLowerCase = minLowerCase;
        this.minUpperCase = minUpperCase;
        this.minDigits = minDigits;
        this.minLength = minLength;
        this.symbolList = symbolList;
        this.minSymbolCount = minSymbolCount;
    }

    /**
     * Проверяет, соответствует ли заданный пароль требованиям.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль соответствует требованиям, и false в противном случае.
     */
    public boolean isValid(String password) {

        return isLengthValid &&
                isUpperCaseContaints &&
                isLowerCaseContaints &&
                isSymbolsContaints &&
                isDigisContaints;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество цифр.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество цифр, и false в противном случае.
     */
    private boolean isDigitsContains(String password) {
        int digisCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digisCounter++;
                if (digisCounter == this.minSymbolCount) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданные символы из списка.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов из списка, и false в противном случае.
     */
    private boolean isSymbolsContains(String password) {
        int symbolCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (symbolList.indexOf(password.charAt(i)) >= 0) {
                symbolCounter++;
                if (symbolCounter == this.minSymbolCount) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество символов верхнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов верхнего регистра, и false в противном случае.
     */
    private boolean isUpperCaseContains(String password) {
        int upperCaseCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upperCaseCounter++;
                if (upperCaseCounter == this.minUpperCase) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество символов нижнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов нижнего регистра, и false в противном случае.
     */
    private boolean isLowerCaseContains(String password) {
        int lowerCaseCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCaseCounter++;
                if (lowerCaseCounter == this.minLowerCase) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Проверяет, является ли длина пароля достаточной.
     *
     * @param password Пароль для проверки.
     * @return true, если длина пароля больше или равна минимальной длине, и false в противном случае.
     */
    private boolean isLengthValid(String password) {
        return password.length() >= this.minLength;
    }
}
