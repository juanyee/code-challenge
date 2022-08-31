package com.example.codechallenge;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CodeChallengeApplicationTests {

	@Test
	void test() {
		// Given
		List<Integer> nums = List.of(3, 2, 4);
		Integer target = 6;

		// When
		List<Integer> output = twoSum(nums, target);

		// Then
		Assert.assertEquals(List.of(1, 2), output);
	}

	private List<Integer> twoSum(List<Integer> nums, Integer target) {
		// Edge cases: What if nums is null, or has only 1 num in it?
		for (int i=0; i<nums.size(); i++) {
			for (int j=0; j<nums.size(); j++) {
				if(i != j && nums.get(i) + nums.get(j) == target) {
					return List.of(i, j);
				}
			}
		}
		return new ArrayList<>();
	}

}
