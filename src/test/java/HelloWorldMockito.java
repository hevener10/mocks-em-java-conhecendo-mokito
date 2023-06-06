import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.validation.constraints.AssertTrue;
import java.util.List;

public class HelloWorldMockito {

    @Test
    void hello(){
        LeilaoDao mockLeilaoDao=Mockito.mock(LeilaoDao.class);
        List<Leilao> todos = mockLeilaoDao.buscarTodos();
        Assert.assertTrue(todos.isEmpty());
    }
}
