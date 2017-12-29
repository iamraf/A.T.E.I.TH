//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab10_inner.pdf

class lab10
{
    private String inString = "Outer inString";
    private String outString = "Outer outString";

    lab10()
    {
        class ConInner
        {
            public void method()
            {
                System.out.println(outString);
            }
        }

        ConInner ci = new ConInner();

        ci.method();
    }

    public static void main(String[] args)
    {
        lab10 out = new lab10();

        lab10.Inner inn = out.new Inner();

        lab10.StaticMan sm = new lab10.StaticMan();

        System.out.println(inn.getInString());
        System.out.println(inn.getOutString());

        sm.method1();
        sm.method2();
        sm.method3();
        sm.method4();

        Printable p = new Printable()
        {
            public void print()
            {
                System.out.println("Kappa");
            }
        };

        p.print();
    }

    interface Printable
    {
        public void print();
    }

    class Inner
    {
        private String inString = "Inner inString";

        public String getInString()
        {
            return this.inString;
        }

        public String getOutString()
        {
            return outString;
        }
    }

    static class StaticMan
    {
        public void method1()
        {

        }

        void method2()
        {

        }

        private void method3()
        {

        }

        protected void method4()
        {

        }

        public String getOutString()
        {
            String result = "";
            //result = outString;
            return result;
        }
    }
}
