package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

public class HogeTest {
    private AutoCloseable closeable;

    @InjectMocks
    private Hoge hoge = new Hoge(new Huga(), new Piyo());
    @Mock
    private Huga huga;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        closeable.close();
    }

    @Test
    void 文字列が連結されていること() {
        doReturn("test").when(huga).huga();
        assertEquals("testpiyo", hoge.hoge());
    }
}
