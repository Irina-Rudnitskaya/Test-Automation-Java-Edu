package test.aqa.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.aqa.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase{
  @Test
   public void testGroupDeletion () {
     app.getNavigationHelper().goToCroupPage();
    int before = app.getGroupHelper().getGroupCount();
    if(! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }
     app.getGroupHelper().selectGroup(before-1);
     app.getGroupHelper().deleteSelectedGroup();
     app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before-1);
  }

}