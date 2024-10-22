
package ST10440024;


public class UserValidator {
    public boolean isValidUsername(String username) {
        return ((username.contains("_")) && (username.length() <= 6));
    }
    
    public boolean isValidPassword(String password) {
        return ((password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") ||
          password.contains("%") ||password.contains("^") || password.contains("&") || password.contains("*")) && (password.length() >= 8) && (password.contains("A") || password.contains("B") || password.contains("C") || password.contains("D") || password.contains("E") || password.contains("F") || password.contains("G") || password.contains("H") || password.contains("I") || password.contains("J") || password.contains("K") || password.contains("L") || password.contains("M") || password.contains("N") || password.contains("O") ||password.contains("P") ||  password.contains("Q") || password.contains("R") || password.contains("S") || password.contains("T") || password.contains("U") || password.contains("V") || password.contains("W") || password.contains("X") || password.contains("Y") || password.contains("Z")) && (password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7") ||password.contains("8") || password.contains("9") || password.contains("0") ));
    }
    
}
