//package spittr;
//
////import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.Test;
//import org.mockito.Mockito;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.servlet.view.InternalResourceView;
//import spittr.data.SpittleRepository;
//import spittr.web.SpittleController;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
////import static org.hamcrest.Matchers.hasItems;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//
//
//class SpittleTest {
//    @Test
//    public void shouldShowRecentSpittles() throws Exception {
//        List<Spittle> expectedSpittles = createSpittleList(20);
//        SpittleRepository mockRepository = Mockito.mock(SpittleRepository.class);
//        when(mockRepository.findSpittles(Long.MAX_VALUE, 20))
//                .thenReturn(expectedSpittles);
//
//        SpittleController controller = new SpittleController(mockRepository);
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                            .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
//                                .build();
//
////        mockMvc.perform(get("/spittles"))
////                .andExpect(view().name("spittles"))
////                .andExpect(model().attributeExists("spittleList"))
////                .andExpect(model().attribute("spittleList", hasItems(expectedSpittles.toArray())));
//    }
//
//    private List<Spittle> createSpittleList(int count) {
//        List<Spittle> spittles = new ArrayList<Spittle>();
//        for (int i=0; i < count; i++) {
//            spittles.add(new Spittle("Spittle " + i, new Date()));
//        }
//        return spittles;
//    }
//}