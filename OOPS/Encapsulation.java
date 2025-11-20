class Encapsulation
{
    // Encapsulation best example is Java Bean Class
    // Java Bean Class is nothing but creating getters and setters method for each non static or instance variables 
    String name ; // it is a instance/non static variable 
    int age;

    // now create getter and setter methods for each variable 
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    // this is a simple example for encapsulation but above is not the right approach 
    //I will take you indepth what is encapsulation , OOPs

}