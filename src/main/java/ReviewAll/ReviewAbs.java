package ReviewAll;

abstract class ReviewAbs implements ReviewInter{
    int a;
    int b;

    @Override
    public int addd(int a, int b) {
        return 0;
    }
    @Override
    public int addd2(){
        return 1;
    }

    abstract public int addd3();


}
