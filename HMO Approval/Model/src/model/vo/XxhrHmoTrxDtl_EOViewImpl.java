package model.vo;

import java.util.Iterator;

import oracle.jbo.Row;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 23 12:44:47 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxhrHmoTrxDtl_EOViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public XxhrHmoTrxDtl_EOViewImpl() {
    }
    public void clearAllCache() {
         //dont ask
         ViewRowSetImpl drsi = super.getDefaultRowSetInternal();
         while(drsi.hasNext()) {
           Row item = drsi.next();
         }

    

         Iterator iter = super.getEntityDef(0).getAllEntityInstancesIterator(this.getDBTransaction());
         while(iter.hasNext()) {
           EntityImpl entityItem = (EntityImpl) iter.next();
           if(entityItem.getEntityState() == EntityImpl.STATUS_NEW ||
             entityItem.getEntityState() == EntityImpl.STATUS_DELETED) {
             entityItem.refresh(EntityImpl.REFRESH_REMOVE_NEW_ROWS | 
         EntityImpl.REFRESH_UNDO_CHANGES);
           }
         }
         getViewObject().clearCache();
       }
}

