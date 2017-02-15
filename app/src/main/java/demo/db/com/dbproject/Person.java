package demo.db.com.dbproject;

import com.orm.SugarRecord;
import com.orm.dsl.Column;

/**
 * Created by zhaoxu2014 on 16/8/26.
 */
public class Person extends SugarRecord {
    String name;
    @Column(name="age")
    int age;
    String addRess;

    String msg_id;


}
