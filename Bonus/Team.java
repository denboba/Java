public class Team {
    Member member;
    Team( Member member ) {
        this.member = member;
    }
    public static void main(String[] args) {
        Member member = new Member("john", 24 , 4);
        System.out.println(member.getName());
        System.out.println("your rank is "+ member.getRank());
        System.out.println("your age is "+member.getAge());

    }

}

class Member {
    private String name;
    private int age;
    private int rank;
    Member(String name,int age,int rank){
        this.name = name ;
        this.rank = rank;
        this.age = age ;
    }
    String getName(){
        return "your name is "+ name ;
    }
    int getRank(){
        return  rank;
    }
    int getAge(){
        return age;
    }
    static void nameric (){
        char char1 = 1, char2 = 2;
        short short1 = 23, short2 = 56;
        int int1 = 79 , int2 = 67;


    }
}