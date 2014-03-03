package com.google.wireless.gdata2.data;

import com.google.wireless.gdata2.data.batch.BatchInfo;
import com.google.wireless.gdata2.parser.ParseException;

public class Entry
{
  private String author = null;
  private BatchInfo batchInfo = null;
  private String category = null;
  private String categoryScheme = null;
  private String content = null;
  private String contentSource = null;
  private String contentType = null;
  private boolean deleted = false;
  private String eTagValue = null;
  private String editUri = null;
  private String email = null;
  private String fields = null;
  private String htmlUri = null;
  private String id = null;
  private String publicationDate = null;
  private String summary = null;
  private String title = null;
  private String updateDate = null;

  protected void appendIfNotNull(StringBuffer paramStringBuffer, String paramString1, String paramString2)
  {
    if (!StringUtils.isEmpty(paramString2))
    {
      paramStringBuffer.append(paramString1);
      paramStringBuffer.append(": ");
      paramStringBuffer.append(paramString2);
      paramStringBuffer.append("\n");
    }
  }

  public void clear()
  {
    this.id = null;
    this.title = null;
    this.editUri = null;
    this.htmlUri = null;
    this.summary = null;
    this.content = null;
    this.contentType = null;
    this.contentSource = null;
    this.author = null;
    this.email = null;
    this.category = null;
    this.categoryScheme = null;
    this.publicationDate = null;
    this.updateDate = null;
    this.deleted = false;
    this.batchInfo = null;
  }

  public String getAuthor()
  {
    return this.author;
  }

  public BatchInfo getBatchInfo()
  {
    return this.batchInfo;
  }

  public String getCategory()
  {
    return this.category;
  }

  public String getCategoryScheme()
  {
    return this.categoryScheme;
  }

  public String getContent()
  {
    return this.content;
  }

  public String getContentSource()
  {
    return this.contentSource;
  }

  public String getContentType()
  {
    return this.contentType;
  }

  public String getETag()
  {
    return this.eTagValue;
  }

  public String getEditUri()
  {
    return this.editUri;
  }

  public String getEmail()
  {
    return this.email;
  }

  public String getFields()
  {
    return this.fields;
  }

  public String getHtmlUri()
  {
    return this.htmlUri;
  }

  public String getId()
  {
    return this.id;
  }

  public String getPublicationDate()
  {
    return this.publicationDate;
  }

  public String getSummary()
  {
    return this.summary;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getUpdateDate()
  {
    return this.updateDate;
  }

  public boolean isDeleted()
  {
    return this.deleted;
  }

  public void setAuthor(String paramString)
  {
    this.author = paramString;
  }

  public void setBatchInfo(BatchInfo paramBatchInfo)
  {
    this.batchInfo = paramBatchInfo;
  }

  public void setCategory(String paramString)
  {
    this.category = paramString;
  }

  public void setCategoryScheme(String paramString)
  {
    this.categoryScheme = paramString;
  }

  public void setContent(String paramString)
  {
    this.content = paramString;
  }

  public void setContentSource(String paramString)
  {
    this.contentSource = paramString;
  }

  public void setContentType(String paramString)
  {
    this.contentType = paramString;
  }

  public void setDeleted(boolean paramBoolean)
  {
    this.deleted = paramBoolean;
  }

  public void setETag(String paramString)
  {
    this.eTagValue = paramString;
  }

  public void setEditUri(String paramString)
  {
    this.editUri = paramString;
  }

  public void setEmail(String paramString)
  {
    this.email = paramString;
  }

  public void setFields(String paramString)
  {
    this.fields = paramString;
  }

  public void setHtmlUri(String paramString)
  {
    this.htmlUri = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setPublicationDate(String paramString)
  {
    this.publicationDate = paramString;
  }

  public void setSummary(String paramString)
  {
    this.summary = paramString;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public void setUpdateDate(String paramString)
  {
    this.updateDate = paramString;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    toString(localStringBuffer);
    return localStringBuffer.toString();
  }

  protected void toString(StringBuffer paramStringBuffer)
  {
    appendIfNotNull(paramStringBuffer, "ID", this.id);
    appendIfNotNull(paramStringBuffer, "TITLE", this.title);
    appendIfNotNull(paramStringBuffer, "EDIT URI", this.editUri);
    appendIfNotNull(paramStringBuffer, "HTML URI", this.htmlUri);
    appendIfNotNull(paramStringBuffer, "SUMMARY", this.summary);
    appendIfNotNull(paramStringBuffer, "CONTENT", this.content);
    appendIfNotNull(paramStringBuffer, "AUTHOR", this.author);
    appendIfNotNull(paramStringBuffer, "CATEGORY", this.category);
    appendIfNotNull(paramStringBuffer, "CATEGORY SCHEME", this.categoryScheme);
    appendIfNotNull(paramStringBuffer, "PUBLICATION DATE", this.publicationDate);
    appendIfNotNull(paramStringBuffer, "UPDATE DATE", this.updateDate);
    appendIfNotNull(paramStringBuffer, "DELETED", String.valueOf(this.deleted));
    appendIfNotNull(paramStringBuffer, "ETAG", String.valueOf(this.eTagValue));
    if (this.batchInfo != null)
      appendIfNotNull(paramStringBuffer, "BATCH", this.batchInfo.toString());
  }

  public void validate()
    throws ParseException
  {
  }
}

/* Location:           C:\Users\科\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.google.wireless.gdata2.data.Entry
 * JD-Core Version:    0.6.2
 */