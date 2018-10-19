import com.alibaba.dao.BookMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations  ={
        "classpath*:/spring-mybatis.xml",
        "classpath*:/spring-service.xml"
})
public class TestJunit {

    @Autowired
    private BookMapper bookMapper;
    @Test
    public void tests(){
        if(bookMapper==null)
            System.out.println("11111111111");
        else
            System.out.println("2222");
    }
}
