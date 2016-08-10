package com.lowbottgames.gpslogger.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.lowbottgames.gpslogger.db.GPSData;

import com.lowbottgames.gpslogger.db.GPSDataDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig gPSDataDaoConfig;

    private final GPSDataDao gPSDataDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        gPSDataDaoConfig = daoConfigMap.get(GPSDataDao.class).clone();
        gPSDataDaoConfig.initIdentityScope(type);

        gPSDataDao = new GPSDataDao(gPSDataDaoConfig, this);

        registerDao(GPSData.class, gPSDataDao);
    }
    
    public void clear() {
        gPSDataDaoConfig.getIdentityScope().clear();
    }

    public GPSDataDao getGPSDataDao() {
        return gPSDataDao;
    }

}
