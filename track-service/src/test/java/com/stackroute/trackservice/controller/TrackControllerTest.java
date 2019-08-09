//package com.stackroute.trackservice.controller;
//
//import com.stackroute.trackservice.domain.Track;
//import com.stackroute.trackservice.exceptions.TrackAlreadyExistsException;
//import com.stackroute.trackservice.service.TrackServiceImpl;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.when;
//
//public class TrackControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//    private Track track;
//    @MockBean
//    private TrackServiceImpl trackService ;
//    @InjectMocks
//    private TrackController trackController;
//    private List<Track> list = null;
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        mockMvc = MockMvcBuilders.standaloneSetup(trackController).setControllerAdvice(new GlobalResponseEntityExceptionHandler()).build();
//        track = new Track();
//        track.setTrackId(20);
//        track.setTrackName("myTrack");
//        track.setComments("myTrack comments");
//        list = new ArrayList<Track>();
//        list.add(track);
//    }
//    @After
//    public void tearDown() {
//        track = null;
//    }
//
//    @Test
//    public void saveTrack() throws TrackAlreadyExistsException {
//        when(trackService.saveTrack(track)).thenReturn(track);
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/track")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    @Test
//    public void getTrackById() {
//    }
//
//    @Test
//    public void getAllTracks() {
//    }
//
//    @Test
//    public void deleteTrackById() {
//    }
//
//    @Test
//    public void updateTrackById() {
//    }
//
//    @Test
//    public void findTrackByName() {
//    }
//}