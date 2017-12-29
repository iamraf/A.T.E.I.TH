//http://aetos.it.teithe.gr/~demos/Downloads/DS_LAB2.pdf

class lab2_2
{
    public static void main(String[] args)
    {
        ArrayStack test = new ArrayStack();

        String expression = "((12+15) * (14 + 13))";
        int counter = 0;

        for(int i = 0; i < expression.length(); i++)
        {
            if(expression.charAt(i) == '(')
            {
                test.push("(");
            }
            else
            {
                if(expression.charAt(i) == ')')
                {
                    if(test.isEmpty())
                    {
                        System.out.println("Result error at position: " + counter);
                        break;
                    }

                    test.pop();
                }
            }

            counter++;
        }

        if(counter == expression.length())
        {
            if(test.isEmpty())
            {
                System.out.println("Result no error");
            }
            else
            {
                System.out.println("Result error");
            }
        }
    }
}
