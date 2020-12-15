package superbderrick.github.io.comments.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user:User)

    @Query(value = "Select * FROM user_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>
}