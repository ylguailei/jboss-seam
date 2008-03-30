package org.jboss.seam.init;

public class EjbEntityDescriptor extends EjbDescriptor
{
   
   private boolean metaDataComplete;

   private String preRemoveMethodName;
   private String prePersistMethodName;
   private String preUpdateMethodName;
   private String postLoadMethodName;
   private String identifierPropertyName;
   private String identifierFieldName;
   private String versionPropertyName;
   private String versionFieldName;
   

   public String getPreRemoveMethodName()
   {
      return preRemoveMethodName;
   }

   public void setPreRemoveMethodName(String preRemoveMethodName)
   {
      this.preRemoveMethodName = preRemoveMethodName;
   }

   public String getPrePersistMethodName()
   {
      return prePersistMethodName;
   }

   public void setPrePersistMethodName(String prePersistMethodName)
   {
      this.prePersistMethodName = prePersistMethodName;
   }

   public String getPreUpdateMethodName()
   {
      return preUpdateMethodName;
   }

   public void setPreUpdateMethodName(String preUpdateMethodName)
   {
      this.preUpdateMethodName = preUpdateMethodName;
   }

   public String getPostLoadMethodName()
   {
      return postLoadMethodName;
   }

   public void setPostLoadMethodName(String postLoadMethodName)
   {
      this.postLoadMethodName = postLoadMethodName;
   }

   public String getIdentifierPropertyName()
   {
      return identifierPropertyName;
   }

   public void setIdentifierPropertyName(String identifierProperty)
   {
      this.identifierPropertyName = identifierProperty;
   }

   public String getVersionPropertyName()
   {
      return versionPropertyName;
   }

   public void setVersionPropertyName(String versionProperty)
   {
      this.versionPropertyName = versionProperty;
   }

   public String getIdentifierFieldName()
   {
      return identifierFieldName;
   }

   public void setIdentifierFieldName(String identifierField)
   {
      this.identifierFieldName = identifierField;
   }

   public String getVersionFieldName()
   {
      return versionFieldName;
   }

   public void setVersionFieldName(String versionField)
   {
      this.versionFieldName = versionField;
   }
   
   public void setVersionAttribute(String versionAttributeName, String accessType)
   {
      if (accessType != null)
      {
         if (accessType == "PROPERTY")
         {
            this.versionPropertyName = versionAttributeName;
         }
         else if (accessType == "FIELD")
         {
            this.versionFieldName = versionAttributeName;
         }
      }
   }
   
   public void setIdentifierAttribute(String identifierAttributeName, String accessType)
   {
      if (accessType != null)
      {
         if (accessType == "PROPERTY")
         {
            this.identifierPropertyName = identifierAttributeName;
         }
         else if (accessType == "FIELD")
         {
            this.identifierFieldName = identifierAttributeName;
         }
      }
   }
   
   public boolean isMetaDataComplete()
   {
      return metaDataComplete;
   }
   
   public void setMetaDataComplete(boolean metaDataComplete)
   {
      this.metaDataComplete = metaDataComplete;
   }

}
