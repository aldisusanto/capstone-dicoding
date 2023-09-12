package com.next.up.code.core.data.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.next.up.code.core.data.local.entity.TouristAttractionEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TouristAttractionDao_Impl implements TouristAttractionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TouristAttractionEntity> __insertionAdapterOfTouristAttractionEntity;

  private final EntityDeletionOrUpdateAdapter<TouristAttractionEntity> __updateAdapterOfTouristAttractionEntity;

  public TouristAttractionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTouristAttractionEntity = new EntityInsertionAdapter<TouristAttractionEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `touristAttractionTable` (`touristAttractionId`,`touristAttractionName`,`address`,`districtName`,`image`,`latitude`,`longitude`,`isFavorite`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TouristAttractionEntity value) {
        stmt.bindLong(1, value.getTouristAttractionId());
        if (value.getTouristAttractionName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTouristAttractionName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        if (value.getDistrictName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDistrictName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLongitude());
        }
        final int _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__updateAdapterOfTouristAttractionEntity = new EntityDeletionOrUpdateAdapter<TouristAttractionEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `touristAttractionTable` SET `touristAttractionId` = ?,`touristAttractionName` = ?,`address` = ?,`districtName` = ?,`image` = ?,`latitude` = ?,`longitude` = ?,`isFavorite` = ? WHERE `touristAttractionId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TouristAttractionEntity value) {
        stmt.bindLong(1, value.getTouristAttractionId());
        if (value.getTouristAttractionName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTouristAttractionName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        if (value.getDistrictName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDistrictName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLongitude());
        }
        final int _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        stmt.bindLong(9, value.getTouristAttractionId());
      }
    };
  }

  @Override
  public void insertTouristAttraction(final List<TouristAttractionEntity> tourism) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTouristAttractionEntity.insert(tourism);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateAttraction(final TouristAttractionEntity tourism) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTouristAttractionEntity.handle(tourism);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<TouristAttractionEntity>> getFavoriteAttraction() {
    final String _sql = "SELECT * FROM touristAttractionTable where isFavorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"touristAttractionTable"}, new Callable<List<TouristAttractionEntity>>() {
      @Override
      public List<TouristAttractionEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTouristAttractionId = CursorUtil.getColumnIndexOrThrow(_cursor, "touristAttractionId");
          final int _cursorIndexOfTouristAttractionName = CursorUtil.getColumnIndexOrThrow(_cursor, "touristAttractionName");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "districtName");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<TouristAttractionEntity> _result = new ArrayList<TouristAttractionEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TouristAttractionEntity _item;
            final int _tmpTouristAttractionId;
            _tmpTouristAttractionId = _cursor.getInt(_cursorIndexOfTouristAttractionId);
            final String _tmpTouristAttractionName;
            if (_cursor.isNull(_cursorIndexOfTouristAttractionName)) {
              _tmpTouristAttractionName = null;
            } else {
              _tmpTouristAttractionName = _cursor.getString(_cursorIndexOfTouristAttractionName);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpDistrictName;
            if (_cursor.isNull(_cursorIndexOfDistrictName)) {
              _tmpDistrictName = null;
            } else {
              _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpLatitude;
            if (_cursor.isNull(_cursorIndexOfLatitude)) {
              _tmpLatitude = null;
            } else {
              _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
            }
            final String _tmpLongitude;
            if (_cursor.isNull(_cursorIndexOfLongitude)) {
              _tmpLongitude = null;
            } else {
              _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new TouristAttractionEntity(_tmpTouristAttractionId,_tmpTouristAttractionName,_tmpAddress,_tmpDistrictName,_tmpImage,_tmpLatitude,_tmpLongitude,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TouristAttractionEntity>> getAllAttraction() {
    final String _sql = "SELECT * FROM touristAttractionTable";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"touristAttractionTable"}, new Callable<List<TouristAttractionEntity>>() {
      @Override
      public List<TouristAttractionEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTouristAttractionId = CursorUtil.getColumnIndexOrThrow(_cursor, "touristAttractionId");
          final int _cursorIndexOfTouristAttractionName = CursorUtil.getColumnIndexOrThrow(_cursor, "touristAttractionName");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "districtName");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<TouristAttractionEntity> _result = new ArrayList<TouristAttractionEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TouristAttractionEntity _item;
            final int _tmpTouristAttractionId;
            _tmpTouristAttractionId = _cursor.getInt(_cursorIndexOfTouristAttractionId);
            final String _tmpTouristAttractionName;
            if (_cursor.isNull(_cursorIndexOfTouristAttractionName)) {
              _tmpTouristAttractionName = null;
            } else {
              _tmpTouristAttractionName = _cursor.getString(_cursorIndexOfTouristAttractionName);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpDistrictName;
            if (_cursor.isNull(_cursorIndexOfDistrictName)) {
              _tmpDistrictName = null;
            } else {
              _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpLatitude;
            if (_cursor.isNull(_cursorIndexOfLatitude)) {
              _tmpLatitude = null;
            } else {
              _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
            }
            final String _tmpLongitude;
            if (_cursor.isNull(_cursorIndexOfLongitude)) {
              _tmpLongitude = null;
            } else {
              _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new TouristAttractionEntity(_tmpTouristAttractionId,_tmpTouristAttractionName,_tmpAddress,_tmpDistrictName,_tmpImage,_tmpLatitude,_tmpLongitude,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
