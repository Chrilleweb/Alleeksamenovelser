public class User {
    private String fullName;
    private String userID;

    public User(String fullName, String userID){
        this.fullName = fullName;
        this.userID = userID;
    }

    public User(){}

    public boolean validUserID(){
        if (userID.length() != 8){
            return false;
        }
        int letterCount = 0;
        int numberCount = 0;
        for (int i = 0; i < userID.length(); i++) {
            char c = userID.charAt(i);
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            }
        }

        // Return true if there are 4 letters and 4 numbers, otherwise return false
        return letterCount == 4 && numberCount == 4;
    }

    public static void main(String[] args){
        User user = new User("ccc", "aaaa2222");
        System.out.println(user.validUserID());
    }
}
