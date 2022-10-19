package inheritance;

public class KidsTest {
    public static void main(String[] args){
        Kids someKid = new Kids();
        someKid.salary = 0;
        someKid.sex = 1;
        someKid.yearsOld = 12;
        someKid.manOrWoman();
        someKid.employeed();
        someKid.printAge();
    }
}
