package src.cronjob;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@Component
public class DeleteInactiveData {
    private static final Logger logger = Logger.getLogger(DeleteInactiveData.class.getName());
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(cron = "0 0 0 1 6 ?")
    public void CleanupData() {

        String timeStamp = dateFormat.format(new Date());
        logger.info("[JOB]: Start. ");
        logger.info("[JOB]: End. ");
    }

//    @Scheduled(cron = "*/2 * * 20 11 ?")
//    public void CleanupData() {
//
//        String timeStamp = dateFormat.format(new Date());
//        logger.info("[JOB]: Start. ");
//        logger.info("[JOB]: End. ");
//    }
}
