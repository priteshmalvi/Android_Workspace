import java.lang.Integer.parseInt

fun main()

{
    var marks = IntArray(5)

    for(i in 0..4)
    {
        println("Enter your marks")
        var mark2 = readLine().toString()

        marks[i] = parseInt(mark2)
    }

    println("Your marks are : ")
    for(i in 0..4)
    {
        println(""+marks[i])
    }

    var total:Int = marks[0] + marks[1] + marks[2] + marks[3] + marks[4]
    println("Your total marks are : $total")

    var per:Int = total/5
    println("Your % are : $per%")

    if(per >75)
        println("You got Dis")

    else(per>60 && per<74)
        println("You got 1st class")

    else(per>49 && per<59)
}