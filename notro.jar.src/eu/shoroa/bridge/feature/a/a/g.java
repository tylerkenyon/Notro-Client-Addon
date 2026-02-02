package eu.shoroa.bridge.feature.a.a;

import eu.shoroa.bridge.d.c.a;
import eu.shoroa.bridge.feature.a.a;
import java.io.File;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public interface g extends a {
  @NotNull
  File dir();
  
  @NotNull
  File serverDir();
  
  @NotNull
  ArrayList<a> allEntries();
  
  @NotNull
  ArrayList<a> activeEntries();
  
  void setActiveEntries(ArrayList<a> paramArrayList);
  
  void openDir();
  
  void refresh();
}


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\a\a\g.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */