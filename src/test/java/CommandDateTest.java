import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CommandDateTest {

    @Test
    public  void GetCorrectDate() {
        CommandDate CommandDateMock = mock(CommandDate.class);
        when(CommandDateMock.Execute()).thenReturn("Current date: 123");

        String str = CommandDateMock.Execute();

        assertEquals(str,"Current date: 123");
    }

}
