package buguisos.madconcert.com.proyectonotification.Notifications

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log


class MyJobService : JobService() {

    override fun onStartJob(jobParameters: JobParameters): Boolean {
        Log.d(TAG, "Performing long running task in scheduled job")
        return false
    }

    override fun onStopJob(jobParameters: JobParameters): Boolean {
        return false
    }

    companion object {

        private val TAG = "MyJobService"
    }

}

