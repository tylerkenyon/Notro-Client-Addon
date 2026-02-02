package eu.shoroa.notro.a;

import java.io.File;
import java.util.List;
import net.minecraft.class_1655;
import net.minecraft.class_1657;
import net.minecraft.class_1671;

public interface e {
  File notro$dirResourcepacks();
  
  class_1655 notro$rprDefaultResourcePack();
  
  File notro$dirServerResourcepacks();
  
  class_1671 notro$rprMetadataSerializer();
  
  class_1655 notro$resourcePackInstance();
  
  List<class_1657.class_1659> notro$repositoryEntriesAll();
  
  List<class_1657.class_1659> notro$repositoryEntries();
  
  void notro$setActiveRepositories(List<class_1657.class_1659> paramList);
  
  void notro$updateRepositoryEntriesAll();
}


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\a\e.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */