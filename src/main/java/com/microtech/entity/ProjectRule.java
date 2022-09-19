package com.microtech.entity;

import com.microtech.common.utils.DataUtils;
import com.microtech.common.utils.FilenameUtils;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectRule implements Serializable {

	private Integer maxFileSize;

	private Set<String> forbiddenFolderNames;

	private Set<String> allowedExtensions;

	private Set<String> allowedBigFileExtensions;

	private Set<String> allowedPublicProjects;

	private Set<String> allowedUserProjects;

	public boolean allowExtension(String name) {
		if (DataUtils.isNull(name)) {
			return false;
		}
		String fileExtension = FilenameUtils.getExtension(name);
		if (DataUtils.isNullOrEmpty(fileExtension)) {
			return true;
		}
		return allowedExtensions
				.stream()
				.anyMatch(fileExtension::equalsIgnoreCase);
	}

}
