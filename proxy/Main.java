package DesignPattern;

public class Main {
	
public static void main(String[] args){
        
        System.out.println("Ketika username dan password benar : ");
        User user = new User("afdal","password");
        FolderFroxy folderFroxy = new FolderFroxy(user);
        folderFroxy.performOperations();
        
        System.out.println();
        
        System.out.println("Ketika username atau password salah :");
        User user2 = new User("abcd","abcd");
        FolderFroxy folderFroxy2 = new FolderFroxy(user2);
        folderFroxy2.performOperations();
        
        
    }

}
