public class UserExam {
    public static void main(String[] args){
        User user = new User("yeseong" , "yeseong0412@dgsw.hs.kr");
//        System.out.println(user.getName());
//        System.out.println(user.getEmail());
        System.out.println(user);
        User user2 =  new User("양예성" , "yeseong0412@dgsw.hs.kr" , "1234");
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword()); //암호는 왠만하면 출력문 사용 하지 않기! (to string 포함)
        System.out.println(user2);
    }
}
