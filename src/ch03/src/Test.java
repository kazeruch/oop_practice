package src.ch03.src;

public class Test {
    public static void main(String[] args){
        One example1 = new One();
        Two example2  = new Two();
        Three example3 = new Three();
        Four example4 = new Four();

        System.out.println(example1.test());
        System.out.println(example1.result1());
        System.out.println(example2.test());
        System.out.println(example2.result1());
        System.out.println(example3.test());
        System.out.println(example4.result1());
        System.out.println(example3.result2());
        System.out.println(example4.result2());
        System.out.println(example3.result3());
        System.out.println(example4.result3());
    }
}

class One extends Object {
    public int test() {
        return 1;
    }

    public int result1() {
        return test();
    }
}

class Two extends One {
    public int test() {
        return 2;
    }
}

class Three extends Two {
    public int result2() {
        return result1();
    }

    public int result3() {
        return super.test();
    }
}

class Four extends Three {
    public int test() {
        return 4;
    }
}
