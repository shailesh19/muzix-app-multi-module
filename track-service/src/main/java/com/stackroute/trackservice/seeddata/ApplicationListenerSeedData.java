package com.stackroute.trackservice.seeddata;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationListenerSeedData implements ApplicationListener<ContextRefreshedEvent>
{
    @Autowired
    private TrackRepository trackRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Track track1 = new Track(01,"Wow","Playlist 101");
        trackRepository.save(track1);
        Track track2 = new Track(02,"Celebrate","Playlist 101");
        trackRepository.save(track2);
        Track track3 = new Track(03,"Friday","Punjabi 101");
        trackRepository.save(track3);
    }
}
