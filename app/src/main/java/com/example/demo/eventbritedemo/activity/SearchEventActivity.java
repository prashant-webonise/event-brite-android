package com.example.demo.eventbritedemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.demo.eventbritedemo.R;
import com.example.demo.eventbritedemo.adapter.EventListAdapter;
import com.example.demo.eventbritedemo.model.EventResponseModel;
import com.example.demo.eventbritedemo.webservice.WebService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

public class SearchEventActivity extends AppCompatActivity {
    private WebService.ApiCallMethods service;
    private RecyclerView recyclerView;
    private EventListAdapter adapter;
    private List<EventResponseModel.EventsEntity> eventsEntityList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initViews();
    }

    private void initViews() {
        final EditText edtSearch = (EditText) findViewById(R.id.edtSearch);
        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                searchEventWithName(s.toString());
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void searchEventWithName(String name) {
        if (null == service) {
            service = WebService.createServiceWithOauthHeader(
                    WebService.ApiCallMethods.class, WebService.ApiCallMethods.SERVICE_ENDPOINT);
        }
        service
                .searchEventWith(name)
                .enqueue(new WebService.CustomCallback<EventResponseModel>() {
                    @Override
                    public void success(Response<EventResponseModel> response) {
                        displayList(response.body());
                    }
                });
    }

    private void displayList(EventResponseModel response) {
        if (null == eventsEntityList) {
            eventsEntityList = new ArrayList<>(response.getEvents());
        } else {
            eventsEntityList.clear();
            eventsEntityList.addAll(response.getEvents());
        }
        if (null == adapter) {
            adapter = new EventListAdapter(this, eventsEntityList);
            recyclerView.setAdapter(adapter);
        } else {
            adapter.notifyDataSetChanged();
        }
    }
}