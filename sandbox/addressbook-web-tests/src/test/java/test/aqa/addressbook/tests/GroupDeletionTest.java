package test.aqa.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.aqa.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTest extends TestBase{
  @Test
   public void testGroupDeletion () {
     app.getNavigationHelper().goToCroupPage();
    if(! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }
     List<GroupData> before = app.getGroupHelper().getGroupList();
     app.getGroupHelper().selectGroup(before.size()-1);
     app.getGroupHelper().deleteSelectedGroup();
     app.getGroupHelper().returnToGroupPage();
     List<GroupData> after = app.getGroupHelper().getGroupList();
     Assert.assertEquals(after.size(), before.size()-1);
  }

}
