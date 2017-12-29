class LaboratoryCourse
{
    Lab[] courses = new Lab[3];

    public void insert(Lab lab)
    {
        for(int i = 0; i < courses.length; i++)
        {
            if(courses[i] == null)
            {
                courses[i] = lab;
                break;
            }
        }
    }

    public void printAllStudent()
    {
        int students = 0;

        for(int i = 0; i < courses.length; i++)
        {
            students += courses[i].labs.length;
        }

        System.out.println("Oloi oi fitites einai: " + students + "\n");
    }

    public void printAllSucessFail()
    {
        int success = 0, fail = 0;

        for(int i = 0; i < courses.length; i++)
        {
            int tmpSuccess = courses[i].findSuccess();
            int tmpFail = courses[i].findFail();

            success += tmpSuccess;
            fail += tmpFail;

            System.out.println("Ergastirio " + (i + 1) + " petuxan " + tmpSuccess + " foitites kai apetuxan " + tmpFail + " foitites.");
        }

        System.out.println("Sunolika petuxan " + success + " foitites kai apetuxan " + fail + " foitites." + "\n");
    }

    public void printAllMo()
    {
        double mo = 0;

        for(int i = 0; i < courses.length; i++)
        {
            double tmpMo = courses[i].findMO();

            mo += tmpMo;

            System.out.println("Ergastirio " + (i + 1) + " mesos oros einai " + tmpMo);
        }

        System.out.println("Sunolika o mesos oros einai " + (mo / courses.length) + "\n");
    }

    public void printAllPercentages()
    {
        double success = 0, fail = 0;

        for(int i = 0; i < courses.length; i++)
        {
            double tmpSuccess = courses[i].findSuccess();
            double tmpFail = courses[i].findFail();

            success += tmpSuccess;
            fail += tmpFail;

            System.out.println("Ergastirio " + (i + 1) + " pososto eputixias " + String.format("%.1f", ((tmpSuccess / courses[i].labs.length) * 100)) + "% kai pososto apotuxias " + String.format("%.1f", ((tmpFail / courses[i].labs.length) * 100)) + "%");
        }

        System.out.println("Sunolika petuxan " + String.format("%.1f", ((success / (success + fail)) * 100)) + "% foitites kai apetuxan " + String.format("%.1f", ((fail / (success + fail)) * 100)) + "%\n");
    }
}
