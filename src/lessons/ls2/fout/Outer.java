package lessons.ls2.fout;

public class Outer {
    public class Inner {
        public int getI() {
            return i;
        }

        public void setI(int i) {
            Outer.this.i = i;
        }
    }

    public static class StaticInner {
        public int getI() {
            return i;
        }
    }
    private static int i = 5;
}
