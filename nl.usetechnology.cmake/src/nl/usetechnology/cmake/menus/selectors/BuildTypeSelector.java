package nl.usetechnology.cmake.menus.selectors;

import nl.usetechnology.cmake.ProjectSettingsAccessor;
import nl.usetechnology.cmake.menus.MenuItemBuilder;
import nl.usetechnology.cmake.menus.MenuItemPostProcessor;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.MenuItem;

public class BuildTypeSelector implements MenuItemPostProcessor {

	@Override
	public void postProcess(MenuItemBuilder builder, MenuItem item, IProject project) {
		if (builder.getName().endsWith(ProjectSettingsAccessor.retrieveBuildType(project))) {
			item.setSelection(true);
		} else {
			item.setSelection(false);
		}
	}

}
