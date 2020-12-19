package trythrow;

public class Try {
    public static void main(String[] args){
        Byte byte1 = 1;
        //int a = 5;
        Integer inte = 10;
        
        //System.out.println(b);

        System.out.println("프로그램 시작");
        Object object = new Object();
        Math.abs(10);
        System.out.println(Math.round(1.4));
        try {
            throw new RuntimeException("예외 발생");
        } catch (RuntimeException e) {
            System.out.println("에러메시지: " + e.getMessage());
        } finally {
            System.out.println("예외 상관 없이 항상 실행");
        }

        System.out.println("프로그램 종료");
    }


}
