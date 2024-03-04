public class Driver {
    public static void main(String[] args) {
        UpwardHat up = new UpwardHat();
        UpwardHat up2 = new UpwardHat();
        DownwardHat down = new DownwardHat();
        FaceMaker face = new FaceMaker();
        Vertical vertical = new Vertical();
        Figure[] figures = new Figure[5];
        figures[0]= up;
        figures[1]=up2;
        figures[2]=down;
        figures[3]=face;
        figures[4]=vertical;
        for(Figure f:figures){
            f.getFigure();
        }
        System.out.println();
        for(Figure f:figures){
            System.out.print(f.getClass().getSimpleName() + " : ");
            f.getFigure();
            System.out.println();
        }



    }
}
