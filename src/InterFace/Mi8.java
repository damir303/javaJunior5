package InterFace;
//      implements - реализовать.
public class Mi8 extends HeliCopter implements VerticalTakeoff{
    @Override
    public void flay() {
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void verticalTakeoff() {
        System.out.println("Helicopter Mi8 vertical");
    }
}
