package com.travelapp.backend.services;
import java.math.BigDecimal;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelapp.backend.repositories.CustomTripRepository;
import com.travelapp.backend.repositories.CustomTripItemRepository;
import java.util.*;
import static org.mockito.Mockito.mock;

@RunWith(SpringRunner.class)
public class CustomTripServiceTest {
    private final int tripId = 1;
    private final int itemId = 1;

    @Test
    public void retrieveAllCustomTrips() {
        //given
        CustomTripRepository customTripRepositoryMock = mock(CustomTripRepository.class);
        CustomTripItemRepository customTripItemRepositoryMock = mock(CustomTripItemRepository.class);
        List<CustomTrip> expectedList = Arrays.asList();

        when(customTripRepositoryMock.findAll()).thenReturn(expectedList);

        CustomTripService service = new CustomTripService(customTripRepositoryMock, customTripItemRepositoryMock);

        //when
        List<CustomTrip> result = service.retrieveAllCustomTrips();

        //then
        assertEquals("Expected and actual list are not equal", expectedList, result);
    }

    @Test
    public void retrieveAllCustomTripItems() {
        //given
        CustomTripRepository customTripRepositoryMock = mock(CustomTripRepository.class);
        CustomTripItemRepository customTripItemRepositoryMock = mock(CustomTripItemRepository.class);
        List<CustomTripItem> expectedList = Arrays.asList();

        when(customTripItemRepositoryMock.findAll()).thenReturn(expectedList);

        CustomTripService service = new CustomTripService(customTripRepositoryMock, customTripItemRepositoryMock);

        //when
        List<CustomTripItem> result = service.retrieveAllCustomTripItems();

        //then
        assertEquals("Expected and actual list are not equal", expectedList, result);
    }

    @Test(expected = RuntimeException.class)
    public void retrieveCustomTripById() {
        //given
        CustomTripRepository customTripRepositoryMock = mock(CustomTripRepository.class);
        CustomTripItemRepository customTripItemRepositoryMock = mock(CustomTripItemRepository.class);

        when(customTripRepositoryMock.findById()).thenThrow(RuntimeException.class("tripId does not exist"));
        CustomTripService service = new CustomTripService(customTripRepositoryMock, customTripItemRepositoryMock);
        //when
        List<CustomTrip> result = service.retrieveAllCustomTrips();
    }
@Test(expected= RuntimeException.class)
public void retrieveAllCustomTrips() {
    //given
    CustomTripRepository customTripRepositoryMock = mock(CustomTripRepository.class);
    CustomTripItemRepository customTripItemRepositoryMock = mock(CustomTripItemRepository.class);
    List<CustomTrip> expectedList = Arrays.asList();

    when(customTripRepositoryMock.findAll()).thenReturn(expectedList);

    CustomTripService service = new CustomTripService(customTripRepositoryMock, customTripItemRepositoryMock);

    //when
    List<CustomTrip> result = service.retrieveAllCustomTrips();

    //then
    assertEquals("Expected and actual list are not equal", expectedList, result);
}<file_sep># Task 5 - e

## Question - e

