package Test;

/**
 * Created by user on 13.12.17.
 */
public class qwe {

        @org.junit.Test
        public void test4() throws Exception {
            a a = new a();
            b b = new b();
            b.setC(10);
            a.set(b);

            b bb = a.get();
            System.out.println(b);
            bb.setC(100);
            System.out.println(b);
            System.out.println(a.get());
        }

        private class a {
            private b a;

            public b get() {
                return a;
            }

            public void set(b b) {
                a = b;
            }
        }

        public class b {
            private int c;

            public int getC() {
                return c;
            }

            public void setC(final int c) {
                this.c = c;
            }

            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("b{");
                sb.append("c=").append(c);
                sb.append('}');
                return sb.toString();
            }
        }

}
