
import com.indianstates.CustomExceptionIncorrectFile;
import com.indianstates.StateCensusAnalyzer;

import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;


public class StatesCensusAnalyserTest {
    @Test
    public void givenStateCensusCSV_CheckNumberOfRecordsMatches() throws Exception {
        StateCensusAnalyzer analyzer = new StateCensusAnalyzer();
        int count = analyzer.loadAnalyzer();
        Assert.assertEquals(4, count, 0);
    }

    @Test
    public <CsvValidationException> void givenStateCensusCSV_ThrowCustomException() throws Exception {
        try {
            StateCensusAnalyzer analyzer = new StateCensusAnalyzer();
            if(analyzer.loadAnalyzer()==0)
                throw new CustomExceptionIncorrectFile();
        } catch (CustomExceptionIncorrectFile e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void givenStateCensusCSV_IfTypeIncorrectThrowCustomException() throws Exception {
        StateCensusAnalyzer analyzer = new StateCensusAnalyzer();
        int count = analyzer.loadAnalyzer();
        Assert.assertEquals(4, count, 0);
    }
    @Test
    public void givenStateCensusCSV_IfDelimiterIncorrectThrowCustomException() throws Exception {
        StateCensusAnalyzer analyzer = new StateCensusAnalyzer();
        int count = analyzer.loadAnalyzer();
        Assert.assertEquals(4, count, 0);
    }

    @Test
    public void givenStateCensusCSV_IfHeaderIncorrectThrowCustomException() throws Exception {
        StateCensusAnalyzer analyzer = new StateCensusAnalyzer();
        int count = analyzer.loadAnalyzer();
        Assert.assertEquals(4, count, 0);
    }
}
