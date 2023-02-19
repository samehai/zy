package com.zy;//package com.zhangzhe.mc;

import com.zy.oms.pojo.entity.YwKck;
import com.zy.oms.repository.IYwKckRepository;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jakarta.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { PersistenceConfig.class })
@Transactional
@Rollback
@Component
public class JPAQuerydslIntegrationTest {

    @Autowired
    private IYwKckRepository repo;

    private YwKck userJohn;
    private YwKck userTom;

    @Before
    public void init() {
        /*userJohn = new YwKck();
        userJohn.setFirstName("John");
        userJohn.setLastName("Doe");
        userJohn.setEmail("john@doe.com");
        userJohn.setAge(22);
        repo.save(userJohn);

        userTom = new MyUser();
        userTom.setFirstName("Tom");
        userTom.setLastName("Doe");
        userTom.setEmail("tom@doe.com");
        userTom.setAge(26);
        repo.save(userTom);*/
    }

    /**
     * 找到具有给定姓氏的用户
     */
//    @Test
//    public void givenLast_whenGettingListOfUsers_thenCorrect() {
//        YwkckPredicatesBuilder builder = new YwkckPredicatesBuilder().with("lastName", ":", "Doe");
//
//        Iterable<YwKck> results = repo.findAll(builder.build());
//        assertThat(results, containsInAnyOrder(userJohn, userTom));
//    }
//
//    /**
//     * 如何找到同时给定名字和姓氏的用户
//     */
//    @Test
//    public void givenFirstAndLastName_whenGettingListOfUsers_thenCorrect() {
//        YwkckPredicatesBuilder builder = new YwkckPredicatesBuilder()
//                .with("firstName", ":", "John").with("lastName", ":", "Doe");
//
//        Iterable<YwKck> results = repo.findAll(builder.build());
//
//        assertThat(results, contains(userJohn));
//        assertThat(results, not(contains(userTom)));
//    }

    /**
     *找到同时具有给定姓氏和最低年龄的用户
     */
//    @Test
//    public void givenLastAndAge_whenGettingListOfUsers_thenCorrect() {
//        YwkckPredicatesBuilder builder = new YwkckPredicatesBuilder()
//                .with("lastName", ":", "Doe").with("age", ">", "25");
//
//        Iterable<YwKck> results = repo.findAll(builder.build());
//
//        assertThat(results, contains(userTom));
//        assertThat(results, not(contains(userJohn)));
//    }
    /**
     * 搜索实际上并不存在的MyUser
     */
//    @Test
//    public void givenWrongFirstAndLast_whenGettingListOfUsers_thenCorrect() {
//        YwkckPredicatesBuilder builder = new YwkckPredicatesBuilder()
//                .with("firstName", ":", "Adam").with("lastName", ":", "Fox");
//
//        Iterable<YwKck> results = repo.findAll(builder.build());
//        assertThat(results, emptyIterable());
//    }
}
