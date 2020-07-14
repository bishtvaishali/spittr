//package spittr.data;
//import java.util.List;
//import org.springframework.stereotype.Repository;
//import spittr.Spittle;
//
///*
//* repository tag is important of autowiring of Bean
//* else you will get error in SpittController class
// * */
//public interface SpittleRepository {
//    List<Spittle> findSpittles(long max, int count);
//}

package spittr.data;

import java.util.List;
import spittr.Spittle;

/**
 * https://stackoverflow.com/questions/40156381/spitter-unsatisfied-dependency-exception-spring-mvc
 * You just need to add a repository implementation of SpittleRepository with @Repository in the header,
 * because even though you have added implementation classes,
 * spring IOC is unaware of actual dependency
 * and the example in the book should have worked if you had
 * put all the java files in the same package hierarchy with repository implementation.
 */
public interface SpittleRepository {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);

}

