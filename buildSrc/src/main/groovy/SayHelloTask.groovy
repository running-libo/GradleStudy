

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

//自定义Task类，必须继承自DefaultTask
class SayHelloTask extends DefaultTask {
    @Input
    String msg = "defualt name"
    @Input
    int age = 18

    @OutputDirectory
    def destDir = project.buildDir

    //构造函数必须用@javax.inject.Inject注解标识
    @javax.inject.Inject
    SayHelloTask(int age) {
        this.age = age
    }

    //通过@TaskAction注解来标识该Task要执行的动作
    @TaskAction
    void sayHello() {
        println("Hello," + msg + ", My age is " + age)
    }

}