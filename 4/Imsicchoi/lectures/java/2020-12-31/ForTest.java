public class ForTest {
    public static void main(String[] args) {
        int i;

//        for 문을 작성하는 방법
//        1.for를 적고 소괄호를 열고 닫고 중괄호를 열고 닫는다.
//        2.for의 소괄호 구성은 아래와 같다
//          (초기화; 조건; 증감부) 형식으로 구성된다.
//          초기화 부분이 없을 수도 있으며
//          조건이 없을 수도 있고
//          증감부가 없을 수도 있다.
//          모든것이 없다면 무한 루프가 될 수 있다.
//         3.중괄호 내부에는 while과 마찬가지로 반복시킬 내용을 작성한다.

//        for 문을 보는 방법
//        for (i = 0; i < 3; i++)의 의미는 무엇인가?
//        i = 0: 초기화 부분
//        초기화 부분은 for문 진입시 최초로 한 번만 수행한다.
//        반복하는 도중에는 초기화 부분을 실행하지 않는다.
//        i < 3: 조건이 만족되는 동안 반복을 한다.
//        i++: 증감은 i+= 2 와 같은 형식으로도 작성이 가능하다.

//        동작 과정
//        초기화 : 최초로 한 번만
//        조건 : 조건이 만족되는 동안만 반복 -> 조건이 만족되면 중괄호로 이동
//        증감부 : 값을 증가하거나 감소시킴 - > 증감 이후에 조건을 확인함
        for (i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        for (int j = 0; j < 4; j++) {
            System.out.println("j = " + j);
        }

        System.out.println("나는 여기서도 나와 = " + i);
//        System.out.println("나는 왜 안돼? " + j);
//        괄호 안에서 선언해서 괄호 안에서만 적용 가능. / 더 이상 main 내에서 j가 살아있는 변수가 아니기 때문이다.
    }
}

