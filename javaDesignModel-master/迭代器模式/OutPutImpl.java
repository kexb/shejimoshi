package iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    // 学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院，然后调用printDeployment输出各个学院的系
    public void printCollege(){
        // 从collegeList取出所有学院，Java中的List已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()){
            // 取出一个学院
            College college = iterator.next();
            System.out.println("==="+college.getName()+"====");
            printDeployment(college.createIterator()); //得到对应的迭代器
        }
    }

    // 输出学院 输出系
    public void printDeployment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
